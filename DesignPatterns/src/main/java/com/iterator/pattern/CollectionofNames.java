package com.iterator.pattern;

public class CollectionofNames implements Container {  
public String name[]={"Harshitha Uriti, Adithya Marredy, Maduri Dasari, Vasantha Sravani"};   
      
    public Iterator getIterator() {  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements Iterator{  
        int i;   
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }    
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  
