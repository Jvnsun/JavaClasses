package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.data.Gems;
import model.data.GemsDAO;
import model.entity.gem.Clarity;
import model.entity.gem.Sort;
import model.entity.necklace.Necklace;

/**
 * Servlet implementation class Controller
 */
@WebServlet("Jewelry")
public class Controller extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static GemsDAO gems;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    gems = Gems.INSTANCE;
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    long[] necklaceIds = {
        3L, 4L, 5L, 6L, 7L
    };

    Necklace necklaceSortedRetained = new Necklace.Builder(Controller.gems,
        necklaceIds).sort(Sort.PRICE_INCREASING)
            .retainInClarityRange(Clarity.Tp, Clarity.IF).build();
    request.setAttribute("necklaceSortedRetained", necklaceSortedRetained);

    response.setContentType("text/html");
    request.getRequestDispatcher("/index.jsp").forward(request, response);
  }

}
