package com.codename1.uikit.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T15:09:07")
@StaticMetamodel(JardinEnfant.class)
public class JardinEnfant_ { 

    public static volatile SingularAttribute<JardinEnfant, Integer> idUser;
    public static volatile SingularAttribute<JardinEnfant, Integer> idJardin;
    public static volatile SingularAttribute<JardinEnfant, Integer> nbPlaceTotal;
    public static volatile SingularAttribute<JardinEnfant, Integer> nbPlaceLibre;
    public static volatile SingularAttribute<JardinEnfant, Date> dateReservation;

}