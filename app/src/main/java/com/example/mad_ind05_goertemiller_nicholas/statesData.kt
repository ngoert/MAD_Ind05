package com.example.mad_ind05_goertemiller_nicholas

import java.util.ArrayList

object statesData {

    val nameOfStates= arrayOf ("Alabama ",
        "Alaska",
        "Arizona",
        "Arkansas",
        "California",
        "Colorado",
        "Connecticut",
        "Delaware",
        "Florida",
        "Georgia",
        "Hawaii",
        "Idaho",
        "Illinois",
        "Indiana",
        "Iowa",
        "Kansas",
        "Kentucky",
        "Louisiana",
        "Maine",
        "Maryland",
        "Massachusetts",
        "Michigan",
        "Minnesota",
        "Mississippi",
        "Missouri",
        "Montana",
        "Nebraska",
        "Nevada",
        "New Hampshire",
        "New Jersey",
        "New Mexico",
        "New York",
        "North Carolina",
        "North Dakota",
        "Ohio",
        "Oklahoma",
        "Oregon",
        "Pennsylvania",
        "Rhode Island",
        "South Carolina",
        "South Dakota",
        "Tennessee",
        "Texas",
        "Utah",
        "Vermont",
        "Virginia",
        "Washington",
        "West Virginia",
        "Wisconsin",
        "Wyoming"
    )

    private val stateInfo = arrayOf(
        "Yellowhammer State, Area: 50,744",
        "The Last Frontier, Area: 571,951",
        "The Grand Canyon State, Area: 113,635",
        "The Natural State, Area: 52,068",
        "The Golden State, Area: 155,959",
        "The Centennial State, Area: 103,718",
        "The Constitution State, Area: 4,845",
        "The First State, Area: 1,954",
        "The Sunshine State, Area: 53,927",
        "The Peach State, Area: 57,906",
        "The Aloha State, Area: 6,423",
        "The Gem State, Area: 82,747",
        "Prairie State, Area: 55,584",
        "The Hoosier State, Area: 35,867",
        "The Hawkeye State, Area: 55,869",
        "The Sunflower State, Area: 81,815",
        "The Bluegrass State, Area: 39,728",
        "The Pelican State, Area: 43,562",
        "The Pine Tree State, Area: 30,862",
        "The Old Line State, Area: 9,774",
        "The Bay State, Area: 7,840",
        "The Great Lakes State, Area: 56,804",
        "The North Star State, Area: 79,610",
        "The Magnolia State, Area: 46,907",
        "The Show Me State, Area: 68,886",
        "The Treasure State, Area: 145,552",
        "The Cornhusker State, Area: 76,872",
        "The Silver State, Area: 109,826",
        "The Granite State, Area: 8,968",
        "The Garden State, Area: 7,417",
        "The Land of Enchantment, Area: 121,356",
        "The Empire State, Area: 47,214",
        "The Tar Heel State, Area: 48,711",
        "The Peace Garden State, Area: 68,976",
        "The Buckeye State, Area: 40,948",
        "The Sooner State,  Area: 68,667",
        "The Beaver State, Area: 95,997",
        "The Keystone State, Area: 44,817",
        "The Ocean State, Area: 1,045",
        "The Palmetto State, Area: 30,109",
        "Mount Rushmore State, Area: 75,885",
        "The Volunteer State, Area: 41,217",
        "The Lone Star State, Area: 261,797",
        "The Beehive State, Area: 82,144",
        "The Green Mountain State, Area: 9,250",
        "The Old Dominion State, Area: 39,594",
        "The Evergreen State, Area: 66,544",
        "The Mountain State, Area: 24,078",
        "The Badger State, Area: 54,310",
        "The Equality or Cowboy State, Area: 97,100"
    )

    val stateImg = intArrayOf(R.drawable.alabama,
        R.drawable.alaska,
        R.drawable.arizona,
        R.drawable.arkansas,
        R.drawable.california,
        R.drawable.colorado,
        R.drawable.connecticut,
        R.drawable.delaware,
        R.drawable.florida,
        R.drawable.georgia,
        R.drawable.hawaii,
        R.drawable.idaho,
        R.drawable.illinois,
        R.drawable.indiana,
        R.drawable.iowa,
        R.drawable.kansas,
        R.drawable.kentucky,
        R.drawable.louisiana,
        R.drawable.maine,
        R.drawable.maryland,
        R.drawable.massachusetts,
        R.drawable.michigan,
        R.drawable.minnesota,
        R.drawable.mississippi,
        R.drawable.missouri,
        R.drawable.montana,
        R.drawable.nebraska,
        R.drawable.nevada,
        R.drawable.new_hampshire,
        R.drawable.new_jersey,
        R.drawable.new_mexico,
        R.drawable.new_york,
        R.drawable.north_carolina,
        R.drawable.north_dakota,
        R.drawable.ohio,
        R.drawable.oklahoma,
        R.drawable.oregon,
        R.drawable.pennsylvania,
        R.drawable.rhode_island,
        R.drawable.south_carolina,
        R.drawable.south_dakota,
        R.drawable.tennessee,
        R.drawable.texas,
        R.drawable.utah,
        R.drawable.vermont,
        R.drawable.virginia,
        R.drawable.washington,
        R.drawable.west_virginia,
        R.drawable.wisconsin,
        R.drawable.wyoming
    )


    val listData: ArrayList<states>
        get() {
            val list = arrayListOf<states>()
            for (position in nameOfStates.indices) {
                val States = states()
                States.name = nameOfStates[position]
                States.detail = stateInfo[position]
                States.photo = stateImg [position]
                list.add(States)
            }
            return list
        }
}