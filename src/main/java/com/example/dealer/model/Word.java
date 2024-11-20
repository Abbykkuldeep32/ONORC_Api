package com.example.dealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_word")
public class Word {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="rating_id")
		private Short id;
		
		@Column(name="word")
		private String word;

		public Short getId() {
			return id;
		}

		public void setId(Short id) {
			this.id = id;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public Word(Short id, String word) {
			super();
			this.id = id;
			this.word = word;
		}
		
		
		
}
