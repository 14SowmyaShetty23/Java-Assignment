//Build a servlet program to check the given number is prime number or not using HTML with step
//by step procedure.
package primenumber;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/primecheck")
public class PrimeCheckServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 2) {
                throw new IllegalArgumentException("Number should be greater than or equal to 2");
            }

            boolean isPrime = true;
            StringBuilder steps = new StringBuilder();
            steps.append("Checking divisibility from 2 to √").append(number).append(":<br>");

            int limit = (int) Math.sqrt(number);
            for (int i = 2; i <= limit; i++) {
                steps.append(number).append(" % ").append(i).append(" = ").append(number % i).append("<br>");
                if (number % i == 0) {
                    isPrime = false;
                    steps.append("Since remainder is 0, ").append(number).append(" is divisible by ").append(i).append(", so it is NOT a prime number.<br>");
                    break;
                }
            }

            if (isPrime) {
                steps.append("No divisors found, ").append(number).append(" is a prime number.<br>");
            }

            // Generate HTML output
            out.println("<html>");
            out.println("<head><title>Prime Check Result</title>");
            out.println("<style>");
            out.println(".container { margin: 20px; padding: 20px; width: 600px; border: 1px solid #ccc; border-radius: 5px; }");
            out.println(".result { margin: 10px 0; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h2>Prime Number Check Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p><strong>Result:</strong> " + (isPrime ? "Prime Number" : "Not a Prime Number") + "</p>");
            out.println("<div class='result'>");
            out.println("<h3>Step-by-step Calculation:</h3>");
            out.println("<p>" + steps.toString() + "</p>");
            out.println("</div>");
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid integer number.");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html>");
        out.println("<head><title>Error</title></head>");
        out.println("<body>");
        out.println("<div style='margin:20px; color:red;'>");
        out.println("<h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}

