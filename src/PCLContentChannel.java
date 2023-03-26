import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLContentChannel implements PropertyChangeListener {

    private String Content;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setContent(evt.getNewValue().toString());
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }
}