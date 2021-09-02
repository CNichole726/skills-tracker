package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String programmingLanguages(){
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here is the list of skills we would like to learn:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("skillsForm")
    @ResponseBody
    public String skillsForm(){
        String html = "<html>" +
                    "<body>" +
                        "<form method = 'post' action='/response'>" +
                            "<label for='name'>Name:</label>" +
                            "<input type = 'text' name = 'name' />"  + "<br>" +
                            "<label for='language'>Favorite Language </label>" +
                                "<select name = 'language' id = 'language'>" +
                                    "<option language = 'Java'>Java</option>" +
                                    "<option language = 'JavaScript'>JavaScript</option>" +
                                    "<option language = 'Python'>Python</option>" +
                                "</select>" + "<br>" +
                            "<label for='secondLanguage'>Second Favorite Language</label>"  +
                                "<select name = 'secondLanguage' id = 'secondLanguage'>" +
                                    "<option secondLanguage = 'Java'>Java</option>" +
                                    "<option secondLanguage = 'JavaScript'>JavaScript</option>" +
                                    "<option secondLanguage = 'Python'>Python</option>" +
                                "</select>" + "<br>" +
                            "<label for='thirdLanguage'>Third Favorite Language</label>"  +
                                "<select name = 'thirdLanguage' id = 'thirdLanguage'>" +
                                    "<option thirdLanguage = 'Java'>Java</option>" +
                                    "<option thirdLanguage = 'JavaScript'>JavaScript</option>" +
                                    "<option thirdLanguage = 'Python'>Python</option>" +
                                "</select>" + "<br>" +
                            "<input type='submit' value='Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html> ";
        return html;
    }

    @RequestMapping(value = "response", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String response(@RequestParam String name, @RequestParam String language, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        return name + "<br>" + "1. " + language + "<br>" + "2. " + secondLanguage + "<br>" + "3. " + thirdLanguage;
    }
}
