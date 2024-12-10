#!/usr/bin/env python3
def read_grades(file_name):
    names = []
    grades = []
    # Open and read file
    with open(file_name, 'r') as file:
        for line in file:
            # Store the contents of file by datatype and remove whitespaces
            name, grade = line.rsplit(',', 1)  
            names.append(name.strip())         
            grades.append(float(grade.strip()))  
    return names, grades

# Method to find and return the highest grade and name attached 
def find_highest_grade(names, grades):
    max_index = grades.index(max(grades)) 
    return names[max_index], grades[max_index]  

# Method to find and return the lowest grade and name attached
def find_lowest_grade(names, grades):
    min_index = grades.index(min(grades))  
    return names[min_index], grades[min_index]  


# Main method
def main():
    # Read the grades from file
    file_name = 'grades.txt'  
    names, grades = read_grades(file_name)

    # Calculate average
    average = sum(grades) / len(grades)
    
    # Find highest and lowest grades
    highest_name, highest_grade = find_highest_grade(names, grades)
    lowest_name, lowest_grade = find_lowest_grade(names, grades)
    
    # Count students above and below average
    above_average = sum(1 for grade in grades if grade > average)
    below_average = sum(1 for grade in grades if grade < average)
    
    # Calculate the percentage of above and below average
    above_percentage = (above_average / len(grades)) * 100
    below_percentage = (below_average / len(grades)) * 100

    # Print reults results
    print(f"Average: {average}")
    print(f"Maximum: {highest_grade} ({highest_name})")
    print(f"Minimum: {lowest_grade} ({lowest_name})")
    print(f"Grades above average: {above_average}, {above_percentage:.1f}%")
    print(f"Grades below average: {below_average}, {below_percentage:.1f}%")

if __name__ == "__main__":
    main()