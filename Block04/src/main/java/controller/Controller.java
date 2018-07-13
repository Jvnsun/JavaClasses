package controller;

import java.util.Scanner;
import java.util.Set;

import model.api.Field;
import model.api.Note;
import model.api.Notebook;
import view.ConsoleView;

public class Controller {
  private Notebook notebook;
  private ConsoleView view;
  private Scanner scanner = new Scanner(System.in);

  public Controller(Notebook nb, ConsoleView view) {
    this.notebook = nb;
    this.view = view;
  }

  public void createNote() {
    Note draft = this.notebook.draftNote();
    Set<Field> fields = this.notebook.getNoteFormat();
    for (Field field : fields) {
      draft.setField(field, getFieldInput(field));
    }
    this.notebook.writeNote(draft);
    this.view.displayNote(draft.getView(), Locale.separator);
  }

  private String getFieldInput(Field field) {
    requestFieldInput(field);
    while (this.scanner.hasNext(field.getRegExp()) == false) {
      this.view.displayMessage(Locale.error + Locale.newLine);
      requestFieldInput(field);
      this.scanner.next();
    }
    return this.scanner.next();
  }

  private void requestFieldInput(Field field) {
    this.view.displayMessage(Locale.request + field.getName() + Locale.separator);
  }

}
