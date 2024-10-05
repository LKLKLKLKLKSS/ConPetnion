package com.pet.model.forum;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "forumphotos")
public class Forumphotos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer photoId; 


    @JsonIgnore
    @Lob
    private byte[] photoFile; // 使用 @Lob 

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post; // 使用 @ManyToOne 和 @JoinColumn 


}
