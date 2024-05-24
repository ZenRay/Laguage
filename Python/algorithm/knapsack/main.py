#coding:utf8


from base.item import Item
from utils import greedy


def buildItems():
    names = ['clock','painting','radio','vase','book','computer']
    values = [175,90,20,50,10,200]
    weights = [10,9,4,2,1,20]
    Items = []
    for i in range(len(values)):
        Items.append(Item(names[i], values[i], weights[i]))
    return Items



def testGreedy(items, maxWeight, sort_key):
    taken, val = greedy(items, maxWeight, sort_key)
    print('Total value of items taken is', val)
    for item in taken:
        print(' ', item)