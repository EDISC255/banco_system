import sys
import csv
import mysql.connector
import traceback

try:

    if len(sys.argv)==3:        
        tabla=sys.argv[1]
        archivo=sys.argv[2]    
        dict_columnas={
            "cliente":"numero, nombre, apellido_paterno, apellido_materno, telefono, celular, domicilio, rfc",
            "cuenta":"numero, tipo, fecha_apertura, capacidad,cliente",
            "tarjeta":"numero, nip, fecha_vencimiento, cuenta",
            "movimiento":"numero, fecha, hora, tipo, cantidad, tarjeta"
        }
        with open(archivo) as csvfile:
            lector = csv.reader(csvfile)
            values = ""
            i=0
            for fila in lector:
                i+=1
                linea = "("+str(i)    
                
                for dato in fila:
                    linea=linea+","+dato
                
                values=values+linea+"),\n"

        sent = "INSERT INTO " +tabla+"("+dict_columnas[tabla]+") VALUES \n" + values
        sql = sent[:-2] 
        print (sql)
    """
        conection=mysql.connector.connect( host="localhost", user="yourusername",password="yourpassword", database="mydb")
        cursor = conection.cursor()
        cursor.execute(sql)

        conection.commit()
"""
except KeyError as ker:
    print ("no existe la tabla", tabla)
    
    traceback.print_exception(type(ker), ker, ker.__traceback__)
except FileNotFoundError as fnfer:
    print ("no existe el archivo", archivo)
    
    traceback.print_exception(type(fnfer), fnfer, fnfer.__traceback__)
