package org.tp.showimgfromlink.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.tp.showimgfromlink.model.NetImage;

public class ImageController {
	
	private static ImageController _instance;
	
	private NetImage currentImage;
	
	private ImageController(){
		super();
	}
	
	public static ImageController getInstance(){
		if(_instance == null) {
			_instance = new ImageController();
		}
		return _instance;
	}
	
	public BufferedImage getImageFromEntity() {
		return getImageFromEntity(currentImage);
	}
	
	public BufferedImage getImageFromEntity(NetImage imageEntity) {
		URL url = null;
		try {
			url = new URL(imageEntity.getUrl());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		BufferedImage image = null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return image;
	}

	public NetImage getCurrentImage() {
		return currentImage;
	}

	public void setCurrentImage(NetImage currentImage) {
		this.currentImage = currentImage;
	}
	
}
