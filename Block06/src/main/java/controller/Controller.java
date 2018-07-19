package controller;

import java.util.Scanner;
import java.util.Set;

import model.api.Field;
import model.api.Note;
import model.api.Notebook;
import model.impl.PersonForm;
import view.ConsoleView;

/**
 * The Class Controller.
 */
public class Controller {

  /** The notebook. */
  private Notebook notebook;

  /** The view. */
  private ConsoleView view;

  /** The scanner. */
  private Scanner scanner = new Scanner(System.in);

  /**
   * Instantiates a new controller.
   *
   * @param nb   the notebook
   * @param view the view
   */
  public Controller(Notebook nb, ConsoleView view) {
    this.notebook = nb;
    this.view = view;
  }

  /**
   * Creates the note, fills it with user input and saves to the notebook
   */
  public void createNote() {
    Note draft = this.notebook.draftNote();
    Set<Field> fields = this.notebook.getNoteFormat();
    for (Field field : fields) {
      draft.setField(field, getFieldInput(field));
    }
    while (true) {
      try {
        this.notebook.writeNote(draft);
        break;
      } catch (IllegalArgumentException e) {
        view.displayMessage(Locale.loginExistsError + e.getMessage() + Locale.newLine);
        draft.setField(PersonForm.NickName, getFieldInput(PersonForm.NickName));
      }
    }
    this.view.displayNote(draft.getView(), Locale.separator);
  }

  /**
   * Gets the field input.
   *
   * @param field to read from user
   * @return the field input
   */
  private String getFieldInput(Field field) {
    requestFieldInput(field);
    while (this.scanner.hasNext(field.getRegExp()) == false) {
      this.view.displayMessage(Locale.error + Locale.newLine);
      requestFieldInput(field);
      this.scanner.next();
    }
    return this.scanner.next();
  }

  /**
   * Request field input in view
   *
   * @param field to read from user
   */
  private void requestFieldInput(Field field) {
    this.view.displayMessage(Locale.request + field.getName() + Locale.separator);
  }

}
