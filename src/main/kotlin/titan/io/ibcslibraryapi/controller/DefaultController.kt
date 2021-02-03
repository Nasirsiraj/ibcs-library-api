package titan.io.ibcslibraryapi.controller

import org.springframework.stereotype.Controller

@Controller
class DefaultController {
    // default api page

    fun getDefaultPage(): String{
        return "index.html"
    }
}
