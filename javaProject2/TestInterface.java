package javaProject2;

interface Usb
{
	public void start();
	public void stop();
}
class MobilDisk implements Usb
{
	public void start()
	{
		System.out.println("Mobil Disk Starts up ...");
	}
	public void stop()
	{
		System.out.println("Mobil Disk Stops ...");
	}
}
class Mp3 implements Usb
{
	public void start()
	{
		System.out.println("MP3 Starts up ...");
	}
	public void stop()
	{
		System.out.println("MP3 Stops ...");
	}
}
class Computer 
{
	public void work(Usb u)
	{
		u.start();
		u.stop();
	}
}

public class TestInterface {

	public static void main(String[] args) {
		new Computer().work(new MobilDisk());
		new Computer().work(new Mp3());
	}

}
