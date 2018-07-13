import controller.Controller;
import model.api.Notebook;
import model.impl.PersonForm;
import model.impl.ListNotebook;
import view.ConsoleView;

public class Main {
  public static void main(String[] args) {
    Notebook notebook = new ListNotebook(PersonForm.Surname, PersonForm.Phone);
    ConsoleView view = new ConsoleView();
    Controller controller = new Controller(notebook, view);
    controller.createNote();
  }

}
