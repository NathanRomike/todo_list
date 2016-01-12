import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Task {
  private String mDescription;

  public Task(String description) {
    mDescription = description;
  }

  public String getDescription() {
    return mDescription;


  }
}
