package com.spring.spellChecker;

public class TextEditor {
   private SpellChecker spellChecker;
   private String name;
   
   // a setter method to inject the dependency.
   public void setSpellChecker(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
   // a getter method to return spellChecker
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
   public void setName(String name){
	   this.name = name;
   }
   public String getName(){
	   return name;
   }
}