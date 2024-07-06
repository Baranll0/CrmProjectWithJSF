
/*
package Filter;

import entity.Customer;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author baran
 */
/*
@WebFilter("/*")
public class CustomerLoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) sr;
        HttpServletResponse response = (HttpServletResponse) sr1;
        String url = request.getRequestURI();
        HttpSession session = request.getSession();
        Customer customer = null;
        
        if (session != null) {
            customer = (Customer) session.getAttribute("customer");
        }

        if (customer == null) {
            if (url.contains("feedback")) {
                response.sendRedirect(request.getContextPath() + "/panel/homepage/account/customerLogin.xhtml");
            } else {
                fc.doFilter(sr, sr1);
            }
        } else {
            fc.doFilter(sr, sr1);
        }

        // The following commented-out code can be safely removed if not needed
        /*
        else {
            if (url.contains("employee")) {
                response.sendRedirect(request.getContextPath() + "/panel/homepage/homepage.xhtml");
            } else {
                fc.doFilter(sr, sr1);
            }
        }
        
    }
}
*/