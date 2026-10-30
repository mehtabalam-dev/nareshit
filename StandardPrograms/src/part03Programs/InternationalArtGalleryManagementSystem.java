package part03Programs;

import java.util.Scanner;

public class InternationalArtGalleryManagementSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================");
		String artId1 = sc.nextLine();
		String artName1 = sc.nextLine();
		double price1 = sc.nextDouble();
		sc.nextLine();
		String artistname1 = sc.nextLine();
		String country1 = sc.nextLine();
		String artId2 = sc.nextLine();
		String artName2 = sc.nextLine();
		double  price2 = sc.nextDouble();
		sc.nextLine();
		String artistname2 = sc.nextLine();
		String country2 = sc.nextLine();
		ArtPiece [] a = new ArtPiece[2];
		a[0] = new ArtPiece(artId1, artName1, price1, new ArtPiece.Artist(artistname1, country1));
		a[1] = new ArtPiece(artId2, artName2, price2, new ArtPiece.Artist(artistname2, country2));
		for(ArtPiece e : a)
		{
			e.printArtDetails();
		}
		
		
	}
}
class ArtPiece
{
	public String artId;
	public String artName;
	public double price;
	public Artist artist;
	public ArtPiece(String artId, String artName, double price,Artist artist) 
	{
		this.artId = artId;
		this.artName = artName;
		this.price = price;
		this.artist = artist;
	}
	static class Artist
	{
		public String artistName;
		public String country;
		public Artist(String artistName, String country) 
		{
 
			this.artistName = artistName;
			this.country = country;
		}
		
	}
	public void printArtDetails()
	{
		System.out.println("Art ID : "+artId);
		System.out.println("Art Name : "+artName);
		System.out.println("Art price : "+price);
		System.out.println("Artist name : "+artist.artistName);
		System.out.println("Artist Country's Name : "+artist.country);
	}
}
