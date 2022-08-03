package com.xworkz.basic_java.UpcastingEx;

public class BusTrainMain {

	public static void main(String[] args, Train train) {
		// TODO Auto-generated method stub
		//Bus bus=(Bus)new Train();
		//bus.passanger();
		//bus.Coach();
		Train trian=new Train();
		train.passanger();
		trian.Coach();

	}

}
