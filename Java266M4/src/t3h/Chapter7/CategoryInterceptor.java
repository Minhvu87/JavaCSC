package t3h.Chapter7;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import t3h.dao.CategoryRepository;

public class CategoryInterceptor implements HandlerInterceptor{
    CategoryRepository repository = new CategoryRepository();
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
//    	System.out.println("Hello");
    	request.setAttribute("categories", repository.getCategories());
        return true;
    }
}
