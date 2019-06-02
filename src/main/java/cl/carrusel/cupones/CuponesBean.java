package cl.carrusel.cupones;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="cuponesBean")
@RequestScoped
public class CuponesBean {

	private List<Cupones> listaImagenes ;
	private int            idImagen;
	private String         imagenSeleccionada;
	
	public CuponesBean() {
		cargaCupones();
		idImagen=0;
		imagenSeleccionada = listaImagenes.get(idImagen).getImage();
	}
	
	public String getImagenSeleccionada() {
		return imagenSeleccionada;
	}

	public void setImagenSeleccionada(String imagenSeleccionada) {
		this.imagenSeleccionada = imagenSeleccionada;
	}

	public void cargaCupones() {
		// Recupera cupones que no han expirado para realizar carrusel de imagenes
		listaImagenes = new ArrayList<Cupones>();
		Cupones imagen01;
		imagen01= new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-P.png");
		imagen01.setDescription("Ardilla");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-1.png");
		imagen01.setDescription("Rana");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-2.png");
		imagen01.setDescription("Oso Polar");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-3.png");
		imagen01.setDescription("Rinoceronte");
		listaImagenes.add(imagen01);
	
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-4.png");
		imagen01.setDescription("Leones");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-5.png");
		imagen01.setDescription("Buho");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-6.png");
		imagen01.setDescription("Reptiles");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-7.png");
		imagen01.setDescription("Oso polar");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-8.png");
		imagen01.setDescription("Ardilla");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-9.png");
		imagen01.setDescription("Tiburon");
		listaImagenes.add(imagen01);
		
		imagen01 = new Cupones();
		imagen01.setImage("https://www.ngenespanol.com/wp-content/uploads/2018/09/Fotos-Divertidas-del-mundo-animal-10.png");
		imagen01.setDescription("Dos animales");
		listaImagenes.add(imagen01);

	}

	public List<Cupones> getListaImagenes() {
		return listaImagenes;
	}

	public void setListaImagenes(List<Cupones> listaImagenes) {
		this.listaImagenes = listaImagenes;
	}

	public int getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}
	
	public void  proximaImagen() {
		if (idImagen+1 < listaImagenes.size()) {
			idImagen = idImagen+1;
		} else {
			idImagen = 0;
		}
		imagenSeleccionada = listaImagenes.get(idImagen).getImage();

	}
	
	public void previaImagen() {
		if (idImagen == 0) {
			idImagen = listaImagenes.size()-1;
		} else {
			idImagen = idImagen-1;
		}
		imagenSeleccionada = listaImagenes.get(idImagen).getImage();
	}
}
