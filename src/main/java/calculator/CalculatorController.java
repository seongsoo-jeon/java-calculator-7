package calculator;

public class CalculatorController {
    public String str;
    public View view;
    public CalModel model;
    public CalculatorController(View view) {
        this.str = view.inputString();
        this.model = new CalModel(str);
        this.view = view;

    }

    public void start() {

        view.print(str);

    }

}