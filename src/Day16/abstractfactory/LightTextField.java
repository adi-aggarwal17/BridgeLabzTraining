package Day16.abstractfactory;

public class LightTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering Light TextField");
    }
}