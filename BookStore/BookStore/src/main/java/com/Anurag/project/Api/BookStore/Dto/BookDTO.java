package com.Anurag.project.Api.BookStore.Dto;import jakarta.validation.constraints.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;import java.time.LocalDate;@Getter@Setter@NoArgsConstructor@AllArgsConstructorpublic class BookDTO {    private Integer id;    @NotBlank(message = "Title of book is blank")    @Size(min = 3, max = 20, message = "Number of the character in title should be in the range : [3,20]")    private String title;    @NotBlank(message = "Author of book is blank")    @Size(min = 3, max = 20, message = "Number of the character in title should be in the range : [3,20]")    private  String author;    @NotNull(message = "price of the book cannot be null")    @Positive(message = "Price of the book must be positive")    private double price;    @NotNull(message = "Rating of the book cannot be blank")    @Positive(message = "Rating of the book is must positive")    @DecimalMin(value="0.5")    @DecimalMax(value = "5.0")    private double rating;    @PastOrPresent(message = "Date of publish can not be in the future")    private LocalDate dateOfPublish;}