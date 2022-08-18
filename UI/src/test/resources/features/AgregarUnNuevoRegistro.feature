#language: es

Característica: Agregar un nuevo registro
    Como usuario
    Necesito realizar un nuevo registro
    Para comprobar que se agregue a la tabla de registros

    Escenario: Nuevo registro agregado exitosaemente
        Dado que el usuario esté en la página y navegue hasta el apartado web tables
        Cuando el usuario suministra los campos solicitados
        Entonces el sistema validará y agregará el registro exitosamente