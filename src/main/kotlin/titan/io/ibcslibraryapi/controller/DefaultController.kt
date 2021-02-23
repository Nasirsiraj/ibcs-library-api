package titan.io.ibcslibraryapi.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@Controller
class DefaultController {
    // default api page

    fun getDefaultPage(): String{
        return "index.html"
    }
}
