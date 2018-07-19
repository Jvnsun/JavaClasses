package model.api;

import java.util.Set;

public abstract class Notebook {

  public Notebook(Field... fields) {
    setNoteFormat(fields);
  }

  protected abstract void setNoteFormat(Field... fields);

  public abstract Set<Field> getNoteFormat();

  public abstract Note draftNote();

  public abstract void writeNote(Note note);
}
