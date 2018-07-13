package model.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import model.api.Field;
import model.api.Note;
import model.api.Notebook;

// TODO change String to Optional<String>
public final class ListNotebook extends Notebook {
  private Set<Field> noteFormat;
  private List<Note> notes;

  public ListNotebook(Field... fields) {
    noteFormat = new LinkedHashSet<>();
    notes = new ArrayList<>();
    setNoteFormat(fields);
  }

  @Override
  protected void setNoteFormat(Field... fields) {
    for (Field field : fields) {
      noteFormat.add(field);
    }
  }

  @Override
  public Set<Field> getNoteFormat() {
    return Collections.unmodifiableSet(noteFormat);
  }

  @Override
  public Note draftNote() {
    MapNote note = new MapNote();
    for (Field field : noteFormat) {
      note.addField(field);
    }
    return note;
  }

  @Override
  public void writeNote(Note note) {
    this.notes.add(note);

  }

}
