package dodontofAPI;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ResourcePane implements Initializable{
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void resourceRenamed(javafx.event.ActionEvent actionEvent) {
        resource.setText(resource.getName());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
