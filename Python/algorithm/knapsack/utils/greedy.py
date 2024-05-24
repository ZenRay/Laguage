#coding:utf8
"""Greedy Algorithm"""


def execute(items, sort_key, max_weight):
    """Execute Algorithm
    
    Search max vavlue by sort key with greedy algorithm
    
    Keyword arguments:
    items: goods item list
    sort_key: sort key
    max_weight: sack max weight
    """
    
    result = []
    total_value, total_weight = 0, 0
    
    for item in sorted(items, key=lambda x: getattr(x, sort_key), reverse=True):
        if total_weight + item.weight <= max_weight:
            total_weight += item.weight
            total_value += item.value
            result.append(item)
        else:
            break
    
    return (result, total_value)