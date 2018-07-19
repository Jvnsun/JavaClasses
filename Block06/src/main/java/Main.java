import controller.Controller;
import model.api.Notebook;
import model.impl.ListNotebook;
import model.impl.PersonForm;
import view.ConsoleView;

public class Main {
  public static void main(String[] args) {
    Notebook notebook = new ListNotebook(PersonForm.Name, PersonForm.Surname, PersonForm.Nick, PersonForm.Phone);
    ConsoleView view = new ConsoleView();
    Controller controller = new Controller(notebook, view);
    controller.createNote();
  }

}
