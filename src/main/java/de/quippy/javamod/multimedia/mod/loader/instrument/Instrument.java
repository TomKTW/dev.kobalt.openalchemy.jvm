/*
 * @(#) Instrument.java
 * 
 * Created on 19.06.2006 by Daniel Becker
 * 
 *-----------------------------------------------------------------------
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */
package de.quippy.javamod.multimedia.mod.loader.instrument;

import de.quippy.javamod.multimedia.mod.ModConstants;

/**
 * @author Daniel Becker
 * @since 19.06.2006
 */
public class Instrument
{
	public int [] sampleIndex;
	public int [] noteIndex;

	public Envelope volumeEnvelope = null;
	public Envelope panningEnvelope = null;
	
	public int volumeFadeOut = -1;

	public String name;
	
	// Impulstracker Values, defaulted:
	public Envelope pitchEnvelope = null;
	public String dosFileName;
	public int dublicateNoteCheck = -1;
	public int dublicateNoteAction = -1;
	public int NNA = -1;
	public int pitchPanSeparation = -1;
	public int pitchPanCenter = 0;
	public int globalVolume = 128;
	public int defaultPan = -1;
	public int randomVolumeVariation = -1;
	public int randomPanningVariation = -1;
	public int randomResonanceVariation = -1;
	public int randomCutOffVariation = -1;
	// Either 0x7F / 0 for off or both 0 (no change)
	public int initialFilterCutoff = 0;
	public int initialFilterResonance = 0;
	
	// MadTracker
	public int filterMode = ModConstants.FLTMODE_UNCHANGED;
	
	/**
	 * Constructor for Instrument
	 */
	public Instrument()
	{
		super();
	}
	/**
	 * Sets the Samplearray
	 * @since 19.06.2006
	 * @param sampleIndexArray
	 */
	public void setIndexArray(int [] sampleIndexArray)
	{
		this.sampleIndex = sampleIndexArray;
	}
	public void setNoteArray(int [] noteIndexArray)
	{
		this.noteIndex = noteIndexArray;
	}
	public int getSampleIndex(int noteIndex)
	{
		if (sampleIndex==null) return -1;
		return this.sampleIndex[noteIndex]-1;
	}
	public int getNoteIndex(int noteIndex)
	{
		if (this.noteIndex==null) return noteIndex;
		return this.noteIndex[noteIndex];
	}
	public void setPanningEnvelope(Envelope panningEnvelope)
	{
		this.panningEnvelope = panningEnvelope;
	}
	public void setVolumeEnvelope(Envelope volumeEnvelope)
	{
		this.volumeEnvelope = volumeEnvelope;
	}
	public void setPitchEnvelope(Envelope pitchEnvelope)
	{
		this.pitchEnvelope = pitchEnvelope;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param dosFileName the dosFileName to set
	 */
	public void setDosFileName(String dosFileName)
	{
		this.dosFileName = dosFileName;
	}
	/**
	 * @param volumeFadeOut The volumeFadeOut to set.
	 */
	public void setVolumeFadeOut(int volumeFadeOut)
	{
		this.volumeFadeOut = volumeFadeOut;
	}
	/**
	 * @param dublicateNoteCheck the dublicateNoteCheck to set
	 */
	public void setDublicateNoteCheck(int dublicateNoteCheck)
	{
		this.dublicateNoteCheck = dublicateNoteCheck;
	}
	/**
	 * @param dublicateNodeAction the dublicateNodeAction to set
	 */
	public void setDublicateNoteAction(int dublicateNoteAction)
	{
		this.dublicateNoteAction = dublicateNoteAction;
	}
	/**
	 * @param nna the NewNoteAction to set
	 */
	public void setNNA(int nna)
	{
		NNA = nna;
	}
	/**
	 * @param pitchPanSeparation the pitchPanSeparation to set
	 */
	public void setPitchPanSeparation(int pitchPanSeparation)
	{
		this.pitchPanSeparation = pitchPanSeparation;
	}
	/**
	 * @param pitchPanCenter the pitchPanCenter to set
	 */
	public void setPitchPanCenter(int pitchPanCenter)
	{
		this.pitchPanCenter = pitchPanCenter;
	}
	/**
	 * @param globalVolume the globalVolume to set
	 */
	public void setGlobalVolume(int globalVolume)
	{
		this.globalVolume = globalVolume;
	}
	/**
	 * @param defaultPan the defaultPan to set
	 */
	public void setDefaultPan(int defaultPan)
	{
		this.defaultPan = defaultPan;
	}
	/**
	 * @param randomVolumeVariation the randomVolumeVariation to set
	 */
	public void setRandomVolumeVariation(int randomVolumeVariation)
	{
		this.randomVolumeVariation = randomVolumeVariation;
	}
	/**
	 * @param randomPanningVariation the randomPanningVariation to set
	 */
	public void setRandomPanningVariation(int randomPanningVariation)
	{
		this.randomPanningVariation = randomPanningVariation;
	}
	/**
	 * @param initialFilterCutoff the initialFilterCutoff to set
	 */
	public void setInitialFilterCutoff(int initialFilterCutoff)
	{
		this.initialFilterCutoff = initialFilterCutoff;
	}
	/**
	 * @param initialFilterResonance the initialFilterResonance to set
	 */
	public void setInitialFilterResonance(int initialFilterResonance)
	{
		this.initialFilterResonance = initialFilterResonance;
	}
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return name;
	}
}
