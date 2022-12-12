
# Java Example
#javac *.java
#java Main
clear
cd Practico5_Empleado
printf "Compiling..."
javac -d bin src/grafica/*.java src/logica/*.java
if [ $? == 0 ] 
then
    clear
    java -cp bin grafica.FrmEmpleado
else
    printf "\n\n\nError - Exit code $?"
fi

