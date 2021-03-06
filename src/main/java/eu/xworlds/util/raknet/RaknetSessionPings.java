/*
    This file is part of "xWorlds utilities".

    "xWorlds utilities" is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    "xWorlds utilities" is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with "nukkit xWorlds plugin". If not, see <http://www.gnu.org/licenses/>.

 */
package eu.xworlds.util.raknet;

/**
 * Ping support for raknet sessions.
 * 
 * @author mepeisen
 */
public interface RaknetSessionPings
{
    
    /**
     * Performs a ping with given timestamp
     * @param pingTime the ping timestamp
     */
    void ping(long pingTime);

    /**
     * Registers a pong for a previous ping.
     * @param pingTime the ping timestamp
     * @param pongTime the pong timestamp
     */
    void registerAnswer(long pingTime, long pongTime);
    
    
    
}
