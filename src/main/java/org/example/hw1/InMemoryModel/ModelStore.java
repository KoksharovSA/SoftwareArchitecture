package org.example.hw1.InMemoryModel;

import org.example.hw1.ModelElements.Camera;
import org.example.hw1.ModelElements.Flash;
import org.example.hw1.ModelElements.PoligonalModel;
import org.example.hw1.ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger{
    List<PoligonalModel> models;
    List<Scene> scenes;
    List<Flash> flashes;
    List<Camera> cameras;
    IModelChangedObserver changeObserver;
    Scene getScena(int id){
        return new Scene();
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
