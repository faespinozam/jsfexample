package cl.carrusel.categorias;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="categoriesBean")
@RequestScoped
public class CategoriesBean {

	private List<Categories> 			categoriasRestantes;
	private List<SubcategoryLevel2>		categoriasTop5;
	private String           			urlCategoriaSeleccionada;
	private int                         idCategoriaSeleccionada;
	
	public CategoriesBean() {
		cargaCategoriasRestantes();
		cargaTop5();
		idCategoriaSeleccionada=0;
		urlCategoriaSeleccionada = categoriasTop5.get(idCategoriaSeleccionada).getIconImageUrl();
	}
	
	
	public void cargaTop5() {
		categoriasTop5 = new ArrayList<SubcategoryLevel2>();
		SubcategoryLevel2 subcategoryLevel2;
		
		subcategoryLevel2 = new SubcategoryLevel2();
		subcategoryLevel2.setName("Autos");
		subcategoryLevel2.setIconImageUrl("https://img.elcomercio.pe/files/ec_article_multimedia_gallery/uploads/2017/08/21/599b2d4f49e95.jpeg");
		categoriasTop5.add(subcategoryLevel2);
		
		subcategoryLevel2 = new SubcategoryLevel2();
		subcategoryLevel2.setName("Alimentos");
		subcategoryLevel2.setIconImageUrl("https://concepto.de/wp-content/uploads/2015/03/alimentos-e1549655531380.jpg");
		categoriasTop5.add(subcategoryLevel2);
		
		subcategoryLevel2 = new SubcategoryLevel2();
		subcategoryLevel2.setName("Animales");
		subcategoryLevel2.setIconImageUrl("https://img.ohmirevista.com/article/480/animal/el-leon-es-conocido-como-el-rey-de-la-selva_90b3460857bfed9da744a36c0a08159bb4345857.jpg");
		categoriasTop5.add(subcategoryLevel2);
		
		subcategoryLevel2 = new SubcategoryLevel2();
		subcategoryLevel2.setName("Vestuario");
		subcategoryLevel2.setIconImageUrl("https://e.an.amtv.pe/util-e-interesante-se-lavar-ropa-nueva-antes-usarla-n268369-624x352-350731.jpg");
		categoriasTop5.add(subcategoryLevel2);

		subcategoryLevel2 = new SubcategoryLevel2();
		subcategoryLevel2.setName("Electronica");
		subcategoryLevel2.setIconImageUrl("https://images-na.ssl-images-amazon.com/images/I/51STl%2BQNTPL.jpg");
		categoriasTop5.add(subcategoryLevel2);
	}
	public List<SubcategoryLevel2> getCategoriasTop5() {
		return categoriasTop5;
	}


	public void setCategoriasTop5(List<SubcategoryLevel2> categoriasTop5) {
		this.categoriasTop5 = categoriasTop5;
	}


	public void cargaCategoriasRestantes() {
		categoriasRestantes = new ArrayList<Categories>();
		Categories categorie;
		
		categorie = new Categories();
		categorie.setId("1");
		categorie.setName("Uno");
		categorie.setRelevance(1);
		categoriasRestantes.add(categorie);
		
		categorie = new Categories();
		categorie.setId("2");
		categorie.setName("Dos");
		categorie.setRelevance(2);
		categoriasRestantes.add(categorie);
		
		categorie = new Categories();
		categorie.setId("3");
		categorie.setName("Tres");
		categorie.setRelevance(3);
		categoriasRestantes.add(categorie);
		
		categorie = new Categories();
		categorie.setId("4");
		categorie.setName("Cuatro");
		categorie.setRelevance(4);
		categoriasRestantes.add(categorie);
		
	}

	public List<Categories> getCategoriasRestantes() {
		return categoriasRestantes;
	}

	public void setCategoriasRestantes(List<Categories> categoriasRestantes) {
		this.categoriasRestantes = categoriasRestantes;
	}


	public String getUrlCategoriaSeleccionada() {
		return urlCategoriaSeleccionada;
	}


	public void setUrlCategoriaSeleccionada(String urlCategoriaSeleccionada) {
		this.urlCategoriaSeleccionada = urlCategoriaSeleccionada;
	}


	public int getIdCategoriaSeleccionada() {
		return idCategoriaSeleccionada;
	}


	public void setIdCategoriaSeleccionada(int idCategoriaSeleccionada) {
		this.idCategoriaSeleccionada = idCategoriaSeleccionada;
	}
	
	public void  proximaImagen() {
		if (idCategoriaSeleccionada+1 < categoriasTop5.size()) {
			idCategoriaSeleccionada = idCategoriaSeleccionada+1;
		} else {
			idCategoriaSeleccionada = 0;
		}
		urlCategoriaSeleccionada = categoriasTop5.get(idCategoriaSeleccionada).getIconImageUrl();

	}
	
	public void previaImagen() {
		if (idCategoriaSeleccionada == 0) {
			idCategoriaSeleccionada = categoriasTop5.size()-1;
		} else {
			idCategoriaSeleccionada = idCategoriaSeleccionada-1;
		}
		urlCategoriaSeleccionada = categoriasTop5.get(idCategoriaSeleccionada).getIconImageUrl();
	}
	
}
