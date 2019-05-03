package es.avalon.jpa.ordenador;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ordenador {

		@Id
		private String modelo;
		private String marca;
		private double precio;
		

		
		public Ordenador() {
			super();
		}
		public Ordenador(String modelo) {
			super();
			this.modelo = modelo;
		}
		public Ordenador(String modelo, String marca, double precio) {
			super();
			this.modelo = modelo;
			this.marca = marca;
			this.precio = precio;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Ordenador other = (Ordenador) obj;
			if (modelo == null) {
				if (other.modelo != null)
					return false;
			} else if (!modelo.equals(other.modelo))
				return false;
			return true;
		}
		
		
		

}
