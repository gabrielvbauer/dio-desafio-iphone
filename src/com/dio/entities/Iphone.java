package com.dio.entities;

import com.dio.interfaces.Browser;
import com.dio.interfaces.MusicalReproducer;
import com.dio.interfaces.PhoneDevice;

public class Iphone implements MusicalReproducer, PhoneDevice, Browser {
  private final String model;
  private final String osVersion;
  private Double storage;
  private Double volume;
  private boolean isConnectedToNetwork;
  private Double signalStrength;

  public Iphone(String model, String osVersion, Double storage) {
    this.model = model;
    this.osVersion = osVersion;
    this.storage = storage;
    this.volume = 5.0;
    this.isConnectedToNetwork = false;
    this.signalStrength = 0.0;
  }

  @Override
  public void showPage() {
    System.out.println("Showing page on browser");
  }

  @Override
  public void openNewPage() {
    System.out.println("Opening a new tab on browser");
  }

  @Override
  public void updatePage() {
    System.out.println("Updating the page on browser");
  }

  @Override
  public void play() {
    System.out.println("Playing song");
  }

  @Override
  public void pause() {
    System.out.println("Pausing song");
  }

  @Override
  public void selectMusic() {
    System.out.println("Selecting the song");
  }

  @Override
  public void call() {
    System.out.println("Making a new call");
  }

  @Override
  public void answer() {
    System.out.println("Answering call");
  }

  @Override
  public void startVoiceMail() {
    System.out.println("Listening to voice mail");
  }

  public String getModel() {
    return model;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public Double getStorage() {
    return storage;
  }

  public void setStorage(Double storage) {
    this.storage = storage;
  }

  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public boolean isConnectedToNetwork() {
    return isConnectedToNetwork;
  }

  public void setConnectedToNetwork(boolean connectedToNetwork) {
    isConnectedToNetwork = connectedToNetwork;
  }

  public Double getSignalStrength() {
    return signalStrength;
  }

  public void setSignalStrength(Double signalStrength) {
    this.signalStrength = signalStrength;
  }
}
