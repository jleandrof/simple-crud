package com.scrud;

import com.scrud.controllers.UserController;
import org.jooby.Jooby;
import org.jooby.apitool.ApiTool;
import org.jooby.json.Jackson;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    use(new Jackson());
    use(UserController.class);

    use(new ApiTool()
            .swagger("/swagger")
            .raml("/raml")
    );
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
