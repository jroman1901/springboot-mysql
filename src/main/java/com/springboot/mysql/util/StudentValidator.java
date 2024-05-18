package com.springboot.mysql.util;

import com.springboot.mysql.exception.ValidationException;
import com.springboot.mysql.modal.Student;

public class StudentValidator
{
    public static void studentValidator(Student student ) throws ValidationException
    {
        if(student.getId() == null )
        {
            throw new ValidationException("Estudiante no especficiado");
        }
        else if ( student.getNombre().isBlank())
        {
            throw new ValidationException("Estudiante no registro el nombre");
        } else if ( student.getFechacumple() == null )
        {
            throw new ValidationException("No registro la fecha de cumpleaños");
        } else if (student.getTelefono().isBlank())
        {
            throw new ValidationException("El telefono no puede ir en blanco");
        }
    }
}
