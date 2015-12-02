package com.dosamantes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
 
public class XmlParser {
	static final String Item = "name";
	static final String ItemPackSize = "packSize";
	static final String OuncesOnHand = "onHand";
	static final String ContainerType = "container";
	static final String QtyPer36 = "per36";
	static final String QtyPerBatch = "perBatch";
	static final String UnitCost = "perUnit";
	
	@SuppressWarnings("unchecked")
	public static List<Ingredient> readIngredients(String ingredientFile){
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			
			InputStream in = new FileInputStream(ingredientFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			
			Ingredient ingredient = null;
			
			// While there is another line to read
			while(eventReader.hasNext()){
				XMLEvent event = eventReader.nextEvent();
				
				if(event.isStartElement()){
					StartElement startElement = event.asStartElement();
					// If the next element is an ingredient, create a new ingredient
					if(startElement.getName().getLocalPart() == (Item)){
						ingredient = new Ingredient();
						
						Iterator<Attribute> attributes = startElement.getAttributes();
						
						while(attributes.hasNext()){
							Attribute attribute = attributes.next();
							if(attribute.getName().toString().equals(Item)){
								ingredient.setItemName(attribute.getValue());
								System.out.println(ingredient.getItemName());
							}
						}
					}
					
					//check the rest of the tags and assign attributes
					
					if(event.isStartElement()){
						if(event.asStartElement().getName().getLocalPart().equals(ItemPackSize)){
							event = eventReader.nextEvent();
							ingredient.setItemPackSize(event.asCharacters().getData());
							continue;
						}
					}
					
					//if(event.asStartElement().getName().getLocalPart().equals(OuncesOnHand)){
					//	event = eventReader.nextEvent();
					//	ingredient.setOnHand(event.asCharacters().getData());
					//	continue;
					//}
					
					if(event.asStartElement().getName().getLocalPart().equals(ContainerType)){
						event = eventReader.nextEvent();
						ingredient.setContainerType(event.asCharacters().getData());
						continue;
					}
					
					if(event.asStartElement().getName().getLocalPart().equals(QtyPer36)){
						event = eventReader.nextEvent();
						ingredient.setQtyPer36(event.asCharacters().getData());
						continue;
					}
					
					if(event.asStartElement().getName().getLocalPart().equals(QtyPerBatch)){
						event = eventReader.nextEvent();
						ingredient.setQtyPerBatch(event.asCharacters().getData());
						continue;
					}
					
					if(event.asStartElement().getName().getLocalPart().equals(UnitCost)){
						event = eventReader.nextEvent();
						ingredient.setUnitCost(event.asCharacters().getData());
						continue;
					}
				}
				
				if(event.isEndElement()){
					EndElement endElement = event.asEndElement();
					if(endElement.getName().getLocalPart() == (Item)){
						ingredients.add(ingredient);
					}
				}
			}
			
		} catch (FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ingredients;
		
	}
	
}
