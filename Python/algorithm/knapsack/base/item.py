#coding:utf8
"""Goods Item Information


"""

class Item:
    def __init__(self, name=None, value=None, weight=None) -> None:
        self.name = name
        self._value = value
        self._weight = weight
        
    
    
    
    def __str__(self):
        if None in (self.name, self._value, self._weight):
            raise Exception("Value is None")
        
        return "Goods<" + "Name:" + self.name + " Value:" +  self._value + \
            " Weight: " + self._weight + "DensityValue: " + \
            self._value / self._weight + ">"
            
    def __repr__(self) -> str:
        if None in (self.name, self._value, self._weight): 
            return "<Item at " + hash(id(self)) + ">"

        else:
            return "Goods<" + "Name:" + self.name + " Value:" +  self._value + \
                " Weight: " + self._weight + "DensityValue: " + \
                self._value / self._weight + ">"
    
    @property
    def value(self):
        return self._value
    
    @property
    def weight(self):
        return self.weight
    
    @property
    def density_value(self):
        return self._value / self.weight