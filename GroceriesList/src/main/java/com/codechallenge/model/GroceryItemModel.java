package com.codechallenge.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
	@Table(name = "itemlist")
public class GroceryItemModel {
	
		@Id
		@Column(name = "item_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name = "item")
		private String item;

		@Column(name = "description")
		private String description;

		@Column(name = "category")
		private String category;

		@Column(name = "quantity")
		private int  quantity;

		@Override
		public String toString() {
			return "GroceryItemModel [id=" + id + ", item=" + item + ", description=" + description + ", category=" + category
					+ ", quantity=" + quantity + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + id;
			result = prime * result + ((item == null) ? 0 : item.hashCode());
			result = prime * result + quantity;
			result = prime * result + ((category == null) ? 0 : category.hashCode());
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
			GroceryItemModel other = (GroceryItemModel) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (id != other.id)
				return false;
			if (item == null) {
				if (other.item != null)
					return false;
			} else if (!item.equals(other.item))
				return false;
			if (quantity != other.quantity)
				return false;
			if (category == null) {
				if (other.category != null)
					return false;
			} else if (!category.equals(other.category))
				return false;
			return true;
		}

		public GroceryItemModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public GroceryItemModel(int id, String item, String description, String category, int quantity) {
			super();
			this.id = id;
			this.item = item;
			this.description = description;
			this.category = category;
			this.quantity = quantity;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		
		
}
