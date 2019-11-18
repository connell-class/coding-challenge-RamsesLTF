package com.codechallenge.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
	@Table(name = "grocerylist")
public class GroceryListModel {
	
	


		@Id
		@Column(name = "grocerieslist_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name = "item_id")
		private int item_id;
		
		@Column(name = "item_quantity")
		private int item_quantity;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getItem_id() {
			return item_id;
		}

		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}

		public int getItem_quantity() {
			return item_quantity;
		}

		public void setItem_quantity(int item_quantity) {
			this.item_quantity = item_quantity;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + item_id;
			result = prime * result + item_quantity;
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
			GroceryListModel other = (GroceryListModel) obj;
			if (id != other.id)
				return false;
			if (item_id != other.item_id)
				return false;
			if (item_quantity != other.item_quantity)
				return false;
			return true;
		}

		public GroceryListModel(int id, int item_id, int item_quantity) {
			super();
			this.id = id;
			this.item_id = item_id;
			this.item_quantity = item_quantity;
		}

		public GroceryListModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "GroceryListModel [id=" + id + ", item_id=" + item_id + ", item_quantity=" + item_quantity + "]";
		}

	
			
		

		


}
