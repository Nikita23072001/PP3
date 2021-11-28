
public class Graphics
{
    private float frequency;
    private String model;

    public Graphics(float frequency, String model)
    {
        this.model = model;
        this.frequency = frequency;
    }

    public String showInfo()
    {
        return (" Model: "+model+" frequency: "+frequency);
    }
}
