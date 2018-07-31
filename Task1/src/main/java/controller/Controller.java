package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.gem.Clarity;
import model.gem.Sort;
import model.gems.Gems;
import model.gems.GemsDAO;
import model.necklace.Necklace;

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
    long[] ids = {
        1L, 2L, 3L, 4L
    };
    Necklace necklace = new Necklace.Builder(Controller.gems, ids)
        .sort(Sort.PRICE_INCREASING)
        .retainInClarityRange(Clarity.Tp, Clarity.IF).build();
    request.setAttribute("necklace", necklace);
    response.setContentType("text/html");
    request.getRequestDispatcher("/index.jsp").forward(request, response);
  }

}
