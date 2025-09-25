/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // Brute force 
    // for(let i = 0; i<nums.length; i++) {
    //     for(let j = i + 1; j < nums.length; j++) {
    //         if(nums[i] + nums[j] == target) {
    //             return [i, j];
    //         }
    //     }
    // }

    // using map
    // let numMap = new Map();
    // for(let i = 0; i < nums.length; i++) {
    //     let complement  = target - nums[i];
    //     if(numMap.has(complement)) {
    //         return [numMap.get(complement), i];
    //     }
    //     numMap.set(nums[i], i);
    // }

    // using object
    let numMap = {};
    for(let i = 0; i < nums.length; i++) {
        let complement = target - nums[i];
        if(numMap[complement] !== undefined) {
            return [numMap[complement], i]
        }
        numMap[nums[i]] = i
    }
    return []
};