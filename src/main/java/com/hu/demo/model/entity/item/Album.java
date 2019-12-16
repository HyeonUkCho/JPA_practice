package com.hu.demo.model.entity.item;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name="id", column = @Column(name="ALBUM_ID"))
public class Album extends Item {

	
}
