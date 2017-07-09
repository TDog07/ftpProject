/**
 * Created by Titian Borman on 09.07.2017.
 */
public class masterClass {

    static public void main (String[] args) {

        ModelClass model = new ModelClass();
        ViewClass view = new ViewClass();
        ControllerClass controller = new ControllerClass(model, view);
    }
}
