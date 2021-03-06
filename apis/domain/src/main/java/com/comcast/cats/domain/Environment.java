/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * This file is part of CATS.
 *
 * CATS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CATS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CATS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comcast.cats.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Groups of {@link Component} . Primarily for testers to reserve and run tests
 * against.
 * 
 * @author subratab
 * 
 */
@XmlRootElement
public class Environment extends Domain
{
    private static final long   serialVersionUID = -1723778406606619009L;

    private List< Server >      servers;
    private List< Reservation > reservations;

    public Environment()
    {
        // TODO Auto-generated constructor stub
    }

    public Environment( String id )
    {
        super( id );
    }

    public Environment( String id, String name )
    {
        super( id, name );
    }

    @XmlElementWrapper( name = "servers" )
    @XmlElement( name = "server" )
    public List< Server > getServers()
    {
        return servers;
    }

    public void setServers( List< Server > servers )
    {
        this.servers = servers;
    }

    @XmlElementWrapper( name = "reservations" )
    @XmlElement( name = "reservation" )
    public List< Reservation > getReservations()
    {
        return reservations;
    }

    public void setReservations( List< Reservation > reservations )
    {
        this.reservations = reservations;
    }

    @Override
    public String toString()
    {
        return super.toString() + getClass().getName() + " [servers=" + getServers() + ", reservations="
                + getReservations() + "]";
    }
}
