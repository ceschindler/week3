package edu.matc.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;

/**
 * @since 1.8
 */
public class CalendarThing extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        String response = determineDayOfWeek();
        JspWriter out = getJspContext().getOut();
        out.println(response);
    }

    public String determineDayOfWeek() {
        LocalDate date = LocalDate.of(2017, 10, 20);
        switch (date.getMonthValue()) {
            case 1:
                return "Happy One month to the Superbowl!";
            case 2:
                return "Happy Superbowl!";
            case 3:
                return "Happy Superbowl month anniversary!";
            case 4:
                return "Happy Superbowl Two month anniversary!";
            case 5:
                return "Happy Superbowl Three month anniversary!";
            case 6:
                return "Happy Superbowl Four month anniversary!";
            case 7:
                return "Happy Superbowl Five month anniversary!";
            case 8:
                return "Happy Superbowl Six month anniversary!";
            case 9:
                return "Happy Oktoberfest Month!!";
            case 10:
                return "Happy Four months to the Superbowl!";
            case 11:
                return "Happy Three months to the Superbowl!";
            case 12:
                return "Happy Two months to the Superbowl!";
            default:
                return "Maybe you shouldn't be here...";
        }
    }
}
