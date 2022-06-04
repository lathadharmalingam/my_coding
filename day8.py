#program to find the index for a given input of fibinocci series
count=0
item=int(input("to get index")) #the element to get index

n=int(input("no of terms\n")) #no of iterations

print("fibinocci") #printing the title

n1=0 #first element
n2=1 #second element 

list=[n1,n2] #creating a list

if(n==1):
 print(n1)
else:
  while(count<n):
    s=n1+n2
    list.append(s) #appending fibinocci values to a list
    n1=n2
    n2=s
    count=count+1
print(list)


if(len(list))>0:
 
 a=list.index(item) #finding the index of given element(item))
 print(a)
