package model.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import model.api.Field;
import model.api.Note;
import model.api.Notebook;

/**
 * The Class ListNotebook.
 */
// TODO change String to Optional<String>
public final class ListNotebook extends Notebook {

  /** The note format. */
  private Set<Field> noteFormat;

  /** The notes. */
  private List<Note> notes;

  /**
   * Instantiates a new list notebook.
   *
   * @param fields - fields that the notes will have
   */
  public ListNotebook(Field... fields) {
    noteFormat = new LinkedHashSet<>();
    notes = new ArrayList<>();
    setNoteFormat(fields);
  }

  /**
   * @param fields - fields that the notes will have
   */
  @Override
  protected void setNoteFormat(Field... fields) {
    for (Field field : fields) {
      noteFormat.add(field);
    }
  }

  /**
   * @return set of fields that the current notebook (and its notes) has
   */
  @Override
  public Set<Field> getNoteFormat() {
    return Collections.unmodifiableSet(noteFormat);
  }

  /**
   * @return new empty note with the notebook's format ( fields )
   */
  @Override
  public Note draftNote() {
    MapNote note = new MapNote();
    for (Field field : noteFormat) {
      note.addField(field);
    }
    return note;
  }

  /**
   * @throws IllegalArgumentException if such nickname is already present in
   *                                  database
   */
  @Override
  public void writeNote(Note note) {
    MapNote mapNote = (MapNote) note;
    if (mapNote.map.containsKey(PersonForm.NickName)) {
      String nickName = mapNote.map.get(PersonForm.NickName);
      if (LoginsDemoStorage.logins.contains(nickName)) {
        throw new IllegalArgumentException(nickName);
      }
    }
    this.notes.add(note);

  }

}
